package br.ufg.inf.es.integracao.topico2;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;

/**
 * Este arquivo faz várias coisas: primeiro ele acessa a API do GitHub e obtém dela o JSON.
 * Logo depois essa imagem será persistida num arquivo. 
 * 
 */
public class BaixarImagem {

    public static void main(String[] args) throws IOException {
        System.out.println(getSessionKey());

        Gson gson = new Gson();
        String json = getSessionKey();
        Map<String, Object> map = new HashMap<String, Object>();
        map = (Map<String, Object>) gson.fromJson(json, map.getClass());

        String myJSONString = getSessionKey();
        JsonObject jobj = new Gson().fromJson(myJSONString, JsonObject.class);

        String result = jobj.get("avatar_url").getAsString();

        InputStream in = new URL(result).openStream();
        Files.copy(in, Paths.get("saida.jpg"));

    }

    public static String getSessionKey() {

        BufferedReader rd = null;
        StringBuilder sb = null;
        String line = null;
        try {
            URL url = new URL("https://api.github.com/users/kyriosdata");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            rd = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            sb = new StringBuilder();

            while ((line = rd.readLine()) != null) {
                sb.append(line + '\n');
            }
            return sb.toString();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (ProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
