import 'dart:convert';

import 'package:http/http.dart';
import 'package:mix_flutter/movie/movie_model.dart';

class MovieApiProvider {
  Client client = Client();
  final _apiKey = 'your_api_key';

  Future<MovieModel> fetchMovieList() async {
    print("entered");
    final response = await client
        .get(Uri.tryParse("http://api.themoviedb.org/3/movie/popular?api_key=$_apiKey"));
    print(response.body.toString());
    if (response.statusCode == 200) {
      // If the call to the server was successful, parse the JSON
      return MovieModel.fromJson(json.decode(response.body));
    } else {
      // If that call was not successful, throw an error.
      throw Exception('Failed to load post');
    }
  }
}