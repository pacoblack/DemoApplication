
import 'package:mix_flutter/movie/movie_model.dart';
import 'package:mix_flutter/movie/movie_provider.dart';

class Repository {
  final moviesApiProvider = MovieApiProvider();

  Future<MovieModel> fetchAllMovies() {
    return moviesApiProvider.fetchMovieList();
  }
}