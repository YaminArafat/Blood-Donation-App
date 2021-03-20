package org.anms.dream;

import android.os.AsyncTask;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class fetchData extends AsyncTask<String,String,String> {
    String data = "";
    String dataParsed = "";
    String singleParsed = "";
    @Override
    protected String doInBackground(String... voids) {

        try {
            URL url = new URL("https://api.myjson.com/bins/1geww2");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            InputStream inputStream = httpURLConnection.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            String line = "";
            while(line != null)
            {
                line = bufferedReader.readLine();
                data = data + line;
            }

            JSONArray JA = new JSONArray(data);
            for(int i=0; i<JA.length(); i++)
            {
                JSONObject JO = (JSONObject) JA.get(i);
                singleParsed =  "\nName : " + JO.get("name") +"\n"+
                                "\nRoll : " + JO.get("roll") +"\n"+
                                "\nDepartment : " + JO.get("dept") +"\n"+
                                "\nHall : " + JO.get("hall") +"\n\n";
                dataParsed = dataParsed + singleParsed;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);

        MainActivity.data.setText(this.dataParsed);

    }

}
