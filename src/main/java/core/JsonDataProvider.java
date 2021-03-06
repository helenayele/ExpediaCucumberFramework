package core;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import java.io.FileReader;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class JsonDataProvider {
    private Reader reader;
    private Gson gson;

    public JsonDataProvider (String filePath) throws Exception {
        reader = new FileReader(filePath);
        gson = new Gson();
    }

    public Map<String,String> getAllData(String dataSet){
        Type type = new TypeToken<HashMap<String, HashMap<String, Map>>>(){}.getType();

        HashMap<String, HashMap<String,Map>> testData = gson.fromJson(reader, type);

        HashMap testDataMap = testData.get("testdata");

        return ((Map) testDataMap.get(dataSet));
    }

}
