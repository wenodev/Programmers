package 프로그래머스.해시;

import java.util.HashMap;
import java.util.Map;

public class 베스트앨범 {

    static class AlbumInfo{

        String genres;
        int plays;
        int index;

        public AlbumInfo(String genres, int plays, int index){
            this.genres = genres;
            this.plays = plays;
            this.index = index;
        }

        public String getGenres() {
            return genres;
        }

        public void setGenres(String genres) {
            this.genres = genres;
        }

        public int getPlays() {
            return plays;
        }

        public void setPlays(int plays) {
            this.plays = plays;
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }
    }

    public static int[] solution(String[] genres, int[] plays){
        int[] answer = {};


        for (int i = 0; i < genres.length; i++) {
            AlbumInfo albumInfo = new AlbumInfo(genres[i], plays[i], i);
        }

        







        return answer;
    }


    public static void main(String[] args) {

        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 250};

        solution(genres, plays);

    }

}
