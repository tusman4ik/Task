package Output;

import java.util.ArrayList;

import Modules.Boxes.Box;
import Modules.Objects.Obj;
import Modules.Storages.Column;
import Modules.Storages.Storage;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class Output {
    public static void printJson() {

        ArrayList<Column> columns = Storage.getStorage(); // Получаем структуру данных

        try {
            String json = convertToJson(columns);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }

    private static String convertToJson(Object obj) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,true);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
    }

}
