import 'dart:async';

import 'package:flutter/material.dart';
import 'package:mix_flutter/bloc.dart';

class AVBlocData implements BlocBase {
  int _count;

  StreamController<int> _countController = new StreamController();
  StreamSink<int> get _inadd => _countController.sink;
  Stream<int> get outCount => _countController.stream;

  StreamController _actionController = new StreamController();
  StreamSink get updateCount => _actionController.sink;

  AVBlocData(){
    _count = 0;
    _actionController.stream.listen(_handleLogic);
  }

  void _handleLogic(data){
    _count = data + 1;
    print("wtg _handleLogic $_count");
    _inadd.add(_count);
  }

  @override
  void dispose(){
    _countController.close();
    _actionController.close();
  }
}

class AVBlocPage extends StatelessWidget{
  int i = 0;
  @override
  Widget build(BuildContext context) {
    final AVBlocData bloc = BlocProvider.of<AVBlocData>(context);
    return new Scaffold(
      appBar: new AppBar(
        title: new Text('AVBloc'),
      ),
      body: new Center(
        child: StreamBuilder<int>(
          stream: bloc.outCount,
          initialData: 0,
          builder: (BuildContext context, AsyncSnapshot<int> snapshot){
            return new Text('You hit me:${snapshot.data} times');
          },
        ),
      ),
      floatingActionButton: FloatingActionButton(
        child: new Icon(Icons.add),
        onPressed: (){
          bloc.updateCount.add(i++);
          print("wtg click $i");
        },
      ),
    );
  }
}

class AVBloc extends StatelessWidget {
  @override
  Widget build(BuildContext context) {
    return new MaterialApp(
      home: BlocProvider<AVBlocData>(
          bloc: new AVBlocData(),
          child: AVBlocPage()
      ),
    );
  }
}