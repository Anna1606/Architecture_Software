package Application;

import Domain.MovieReview;

import java.util.List;

public interface IPrintMovieReviews {
    public void writeMovieReviews(List<MovieReview> movieReviewList);
}
