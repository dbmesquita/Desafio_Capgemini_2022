package br.com.dbmesquita.capgemini.questions.IdentifySubstring;

import java.util.Arrays;
import java.util.HashMap;
public class identifySubstringMethod {
    public Integer countSubsrtring(String word){

        return analyzeSubstring(word);
    }

    private Integer analyzeSubstring (String word){
        HashMap<String, Integer> map = new HashMap<>();

        for (int indexOne = 0; indexOne < word.length(); indexOne++) {
            for (int j = indexOne; j < word.length(); j++) {
                char[] valC = word.substring(indexOne, j + 1).toCharArray();
                Arrays.sort(valC);
                String val = new String(valC);
                if (map.containsKey(val))
                    map.put(val, map.get(val) + 1);
                else
                    map.put(val, 1);
            }
        }
        int CountPair = 0;
        for (String key : map.keySet()) {
            int n = map.get(key);
            CountPair += (n * (n - 1)) / 2;
        }
        return CountPair;

    }
}
