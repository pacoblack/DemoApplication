import 'package:mix_flutter/bloc.dart';
import 'package:mix_flutter/movie/movie_model.dart';
import 'package:mix_flutter/movie/repository.dart';
import 'package:rxdart/rxdart.dart';

class MovieBlocData extends BlocBase{
  final _repository = Repository();
  final _publishSubject = PublishSubject<MovieModel>();

  Stream<MovieModel> get allMovies => _publishSubject.stream;

  fetchAllMovies() async {
    MovieModel item = await _repository.fetchAllMovies();
    _publishSubject.sink.add(item);
  }

  @override
  dispose() {
    _publishSubject.close();
  }
}