package tools;

import com.google.gson.Gson;

/**
 * Created by wentian.wang on 25/03/2018
 */
public class JsonHelper {
    private static Gson gson = new Gson();

    public static String toJson(Object obj){
        return gson.toJson(obj);
    }

}
