package Kapitel_7;

public class Task17 {

    int numberofstudent = 3;


    public static void main(String[] args) {
        String[] names = {"Chilas", "Jens", "Gustav"};
        int[] score = {54, 23, 98};

        Task17 opgave = new Task17();
        int[] newscore;
        newscore = opgave.newsort(score);

        for (int i = 0; i < score.length; i++) {
            System.out.println(newscore[i]);
        }
    }


    public int[] newsort(int score[]){
        int[] newscore = {score.length};
        int savei = -1 ;
        for (int i = 0; i <score.length-1 ; i++) {
            int max = 0;
            for (int j = 0; j <score.length-1 ; j++) {
                max = score[0];
                if (max<score[i]){
                    max = score[i];
                    savei = i;
                }
                if (i == (score.length-1)){
                    score[savei] = 0;
                }

            }
            newscore[i]= max;

        }


        return newscore;

    }





    public int[] sorting(String names[], int score[]) {
        int[] newscore = new int[score.length];
        int maxi;
        for (int i = 0; i < score.length; i++) {
            maxi = min(score);
          if (score[maxi]==-1){break;}
          else {
          newscore[i] = score[maxi];
          score[i] = -1;
        }}
        return newscore;
    }

    public int min(int score[]) {
        int max = score[0];
        int maxi = 0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] > max) {
                max = score[i];
                maxi = i;
            }
        }
        return maxi;
    }
}
