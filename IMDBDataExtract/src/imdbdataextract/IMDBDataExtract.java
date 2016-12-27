/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imdbdataextract;

/**
 *
 * @author prane
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import static java.util.logging.Logger.global;
import jdk.nashorn.internal.objects.Global;
import static jdk.nashorn.internal.objects.NativeDate.parse;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONArray;
import org.json.JSONObject;

 
public class IMDBDataExtract {
 
 private String BaseUrl;
 private String ResponderUrl;
 private String responderParameters;

 
 /*
  *Constructor sets BaseUrl, ResponderUrl and ResponderParameters properties
  */
 public IMDBDataExtract() {
         //this.BaseUrl = "https://api.themoviedb.org/3/movie/2100?api_key=ff952840f45b98d699b51692ac712cdd";
         this.ResponderUrl = "~api/search/room?action=GET";
         this.responderParameters = "fields=RowNumber%2CId%2CRoomName%2CRoomDescription%2CRoomNumber%2CRoomTypeName%2CBuildingCode%2CBuildingName%2CCampusName%2CCapacity%2CBuildingRoomNumberRoomName%2CCanEdit%2CCanDelete&sortOrder=%2BBuildingRoomNumberRoomName";
 }
 
 public String Login(String url) throws MalformedURLException, IOException {
     try
     {
         //this.BaseUrl = "https://api.themoviedb.org/3/movie/"+str+"?api_key=ff952840f45b98d699b51692ac712cdd";
         //this.BaseUrl="https://api.themoviedb.org/3/genre/movie/list?api_key=ff952840f45b98d699b51692ac712cdd&language=en-US";
         this.BaseUrl=url;
         //this.BaseUrl="http://api.themoviedb.org/3/movie/"+str+"/videos?api_key=ff952840f45b98d699b51692ac712cdd";
         HttpURLConnection httpcon = (HttpURLConnection) ((new URL(BaseUrl).openConnection()));
         httpcon.setDoOutput(true);
         httpcon.connect();
         BufferedReader inreader = new BufferedReader(new InputStreamReader(httpcon.getInputStream()));
         StringBuilder sb = new StringBuilder();
         String line;
      
         while ((line = inreader.readLine()) != null) 
         {
                sb.append(line);
         }
         return sb.toString();
     }
     catch(Exception e)
             {
                 System.out.println(e.getMessage());
                 return "";
             }
     
 }
// 
// public static void main(String[] args) throws Exception {
//         IMDBDataExtract api = new IMDBDataExtract();
//         PrintWriter pw = new PrintWriter(new File("test.csv"));
//         StringBuilder sbnew = new StringBuilder();
//         for(int i=2990; i<3000;i++)
//         {
//         String data = api.Login(String.valueOf(i));
//         //String data = api.Login("");
//         StringBuilder sb = new StringBuilder();
//         if(data!="")
//         {
//         JSONObject json = new JSONObject(data);
//         JSONArray jsarr = new JSONArray();
//         JSONArray jsarr2 = new JSONArray();
         
         //JSONObject info = json.getJSONObject("name");
           //Genre code
           /*Iterator<String> keys = json.keys();
           if( keys.hasNext() )
            {
                String key = json.getString("genres").toString();// First key in your json object
                //json.getJSONArray(key);
                System.out.println(key);
            }*/
           
//           sb.append(json.getString("budget"));
//           sb.append(',');
//           sb.append(json.getString("homepage"));
//           sb.append(',');
//           sb.append(json.getString("id"));
//           sb.append(',');
           //sb.append(json.getString("imdb_id"));
           
           //sb.append(json.getString("cast"));
           //sb.append(',');
//           sb.append(json.getString("original_language"));
//           sb.append(',');
//           sb.append(json.getString("original_title"));
//           sb.append(',');
//           sb.append(json.getString("popularity"));
//           sb.append(',');
//           sb.append(json.getString("poster_path"));
//           sb.append(',');
//           sb.append(json.getString("release_date"));
//           sb.append(',');
//           sb.append(json.getString("revenue"));
//           sb.append(',');
//           sb.append(json.getString("runtime"));
//           sb.append(',');
//           sb.append(json.getString("status"));
//           sb.append(',');
//           sb.append(json.getString("tagline"));
//           sb.append(',');
//           sb.append(json.getString("title"));
//           sb.append(',');
//           sb.append(json.getString("video"));
//           sb.append(',');
//           sb.append(json.getString("vote_average"));
//           sb.append(',');
//           sb.append(json.getString("vote_count"));
//           sb.append(',');
//           sb.append(json.getString("overview").replace("\n",""));
//           sb.append(',');
//           sb.append("\n");

           //sbnew.append(sb);
         }
         //if(i%39==0)
             //TimeUnit.SECONDS.sleep(10);
         
       //}
//        pw.write(sbnew.toString());
//        pw.close();
//        System.out.println("done!");
         
//           sbnew.append("genre");
//           sbnew.append(',');
//           sb.append("budget");
//           sbnew.append(',');
//           sb.append("homepage");
//           sbnew.append(',');
//           sb.append("id");
//           sbnew.append(',');
//           sb.append("imdb_id");
//           sbnew.append(',');
//           sb.append("original_language");
//           sbnew.append(',');
//           sb.append("original_title");
//           sbnew.append(',');
//           sb.append("overview");
//           sbnew.append(',');
//           sb.append("popularity");
//           sbnew.append(',');
//           sb.append("poster_path");
//           sbnew.append(',');
//           sb.append("release_date");
//           sbnew.append(',');
//           sb.append("revenue");
//           sbnew.append(',');
//           sb.append("runtime");
//           sbnew.append(',');
//           sb.append("status");
//           sbnew.append(',');
//           sb.append("tagline");
//           sbnew.append(',');
//           sb.append("title");
//           sbnew.append(',');
//           sb.append("video");
//           sbnew.append(',');
//           sb.append("vote_average");
//           sbnew.append(',');
//           sb.append("vote_count");
//           sbnew.append(',');
           
        
         
//         System.out.println(json.getJSONArray("genres"));
//         System.out.println(json.getString("budget"));
//         System.out.println(json.getString("homepage"));
//         System.out.println(json.getString("id"));
//         System.out.println(json.getString("imdb_id"));
//         System.out.println(json.getString("original_language"));
//         System.out.println(json.getString("original_title"));
//         System.out.println(json.getString("overview"));
//         System.out.println(json.getString("popularity"));
//         System.out.println(json.getString("poster_path"));
//         System.out.println(json.getString("release_date"));
//         System.out.println(json.getString("revenue"));
//         System.out.println(json.getString("runtime"));
//         System.out.println(json.getString("status"));
//         System.out.println(json.getString("tagline"));
//         System.out.println(json.getString("title"));
//         System.out.println(json.getString("video"));
//         System.out.println(json.getString("vote_average"));
//         System.out.println(json.getString("vote_count"));
         
         
         //System.out.println(json);
         //JSONArray jsonArray = new JSONArray(json.getString("title"));
         //System.out.println(jsonArray.get(0));
         //api.ApiResponder(api.Login());
          
//       
    
//}//
//}
//}
