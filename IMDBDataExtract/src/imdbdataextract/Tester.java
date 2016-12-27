/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdbdataextract;

import com.google.gson.Gson;
import java.io.IOException;
import imdbdataextract.Movie;
import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author prane
 */
public class Tester {

    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = new Gson();
        IMDBDataExtract api = new IMDBDataExtract();
        PrintWriter pw = new PrintWriter(new File("genretv.csv"));
        PrintWriter pw2 = new PrintWriter(new File("tvcrew.csv"));
        StringBuffer sb = new StringBuffer();
        StringBuffer sb2 = new StringBuffer();
        //int castidnum=1;
        
         for(int i=4500; i<5000;i++)
         {
            String url = "https://api.themoviedb.org/3/movie/"+String.valueOf(i)+"/credits?api_key=ff952840f45b98d699b51692ac712cdd";
            //String url = "https://api.themoviedb.org//3/tv/"+String.valueOf(i)+"?api_key=ff952840f45b98d699b51692ac712cdd";
            //String url = "https://api.themoviedb.org/3/tv/"+String.valueOf(i)+"/season/"+String.valueOf(j)+"?api_key=ff952840f45b98d699b51692ac712cdd";
//            for(int j=1;j<3;j++)
//            {
//                for(int k=1;k<4;k++)
//                {  
            //String url2="https://api.themoviedb.org/3/tv/"+String.valueOf(i)+"/season/"+String.valueOf(j)+"/episode/"+String.valueOf(k)+"/credits?api_key=ff952840f45b98d699b51692ac712cdd";
            String url2="https://api.themoviedb.org/3/tv/"+String.valueOf(i)+"/credits?api_key=ff952840f45b98d699b51692ac712cdd";
            String url3="https://api.themoviedb.org/3/tv/"+String.valueOf(i)+"?api_key=ff952840f45b98d699b51692ac712cdd";
            String JsonString = api.Login(url3);
       
            if(JsonString!="")
                {
                  
//                Movie m = gson.fromJson(JsonString, Movie.class);
                    Movie_Detail md = gson.fromJson(JsonString, Movie_Detail.class);
//                Cast[] casts = m.getCast();
                    Genre[] genres = md.getGenres();
//                Crew[] crews = m.getCrew();
                //int counter =0;
//                for (Crew crew : crews)
//                {
//                String url3="https://api.themoviedb.org/3/person/"+String.valueOf(crew.getId())+"?api_key=ff952840f45b98d699b51692ac712cdd";
//                String JsonString2 = api.Login(url3);
//                
//                if(JsonString2!="")
//                {
//                Celebrity celeb = gson.fromJson(JsonString2, Celebrity.class);
//                sb.append(String.valueOf(i));
//                sb.append(",");
//                sb.append(String.valueOf(j));
//                sb.append(",");
//                sb.append(String.valueOf(k));
//                sb.append(",");
//                sb.append(m.getId());
//                sb.append(","); 
////                sb.append(crew.getCharacter());
////                sb.append(",");
//                sb.append(celeb.getBirthday());
//                sb.append(",");
//                sb.append(celeb.getPopularity());
//                sb.append(",");
//                sb.append(celeb.getId());
//                sb.append(",");
//                sb.append(celeb.getName());
//                sb.append(",");
//                sb.append(celeb.getPlace_of_birth());
//                sb.append("\n");
//                counter++;
//                if(counter%3==0)
//                TimeUnit.SECONDS.sleep(1);
//                }
//                }
            
            for (Genre genre : genres)
            {
                sb2.append(String.valueOf(i));
                sb2.append(",");
                sb2.append(genre.getId());
                sb2.append(",");
                sb2.append(genre.getName());
                sb2.append("\n");
            }
            //sb.append("\n");
            //sb2.append("\n");
        }
//             if(k%3==0)
//             TimeUnit.SECONDS.sleep(1);
//         }
//                if(j%3==0)
//             TimeUnit.SECONDS.sleep(1);
//            }
        if(i%3==0)
             TimeUnit.SECONDS.sleep(1);
    }
         pw.write(sb2.toString());
        pw.close();
        System.out.println("done! ");
    
}
}

