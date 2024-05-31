package opgaver.opgave1;

import dictionaryelev2.DictionaryHashMap;
import dictionaryelev2.DictionaryLinked;

import java.util.HashMap;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Bil> bilerHash = new HashSet<>();

        Bil b1 = new Bil("AJ89213", "AUDI", "A6", "RØD");
        Bil b2 = new Bil("AJ89213", "AUDI", "A6", "RØD");
        Bil b3 = new Bil("AJ89213", "AUDI", "A6", "RØD");
        Bil b4 = new Bil("ZL23124", "PEUGOET", "106 GT", "GRØN");
        Bil b5 = new Bil("PE29123", "SEAT", "LEON", "HVID");

        bilerHash.add(b1);
        bilerHash.add(b2);
        bilerHash.add(b3);
        bilerHash.add(b4);
        bilerHash.add(b5);

        System.out.println(bilerHash);

        //Opgave 1
        //Bilerne der er forskellige fra hinanden bliver tilføjet i rækkefølge, så b1, b4, b5
        //De 2 biler der ligner b1, bliver sat bagerst i HashSettet

        //Opgave 2
        DictionaryLinked<Bil, Integer> bilerDic = new DictionaryLinked<>();
        bilerDic.put(b1, 1);
        bilerDic.put(b2, 5);
        bilerDic.put(b3, 2);
        bilerDic.put(b4, 4);
        bilerDic.put(b5, 10);

        System.out.println(bilerDic);
    }

}
