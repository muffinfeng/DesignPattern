package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class MapFactory {

    Map<String, FlyWeightPattern.Map> LOLMaps = new HashMap<>();

    public FlyWeightPattern.Map getMap(String type){
        if(!LOLMaps.containsKey(type)){
            LOLMaps.put(type, new ConcreteMap(type));
        }

        return (FlyWeightPattern.Map)LOLMaps.get(type);
    }

    public int getMapsLength(){
        return LOLMaps.size();
    }
}
