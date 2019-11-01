package program;

import javax.xml.namespace.QName;
import java.util.*;
import java.util.function.Predicate;

class SearchEngine {
    String key;
    int value;

    SearchEngine(){

    }
    public SearchEngine(String key, int value) {
        this.key = key;
        this.value = value;
    }

    public String getKey(){
        return key;
    }

    public int getValue(){
        return value;
    }
}
public class Search {

    private static void createFilterList(String tmp, List<SearchEngine> list, Map<String, Integer> map){
        if(map.containsKey(tmp)){
            for(int i=0;i<list.size();i++){
                SearchEngine obj = list.get(i);
                if(tmp.equals(obj.key)){
                    obj.value +=1;
                    list.set(i,obj);
                    break;
                }
            }
        }else{
            SearchEngine searchEngine = new SearchEngine();
            map.put(tmp,1);
            searchEngine.key = tmp;
            searchEngine.value = 1;
            list.add(searchEngine);
        }
    }

    static class SortComparator implements Comparator<SearchEngine>{

        @Override
        public int compare(SearchEngine o1, SearchEngine o2) {

            if(o2.value == o1.value){
                return o1.key.compareTo(o2.key);
            }else{
                return o2.value-o1.value;
            }
        }
    }

    private static void printTopNItems(String tmp, List<SearchEngine> list) {
        int c = tmp.charAt(tmp.length()-1)-'0';

        SortComparator sortComparator = new SortComparator();
        Collections.sort(list,sortComparator);
        for(int i=0;i<c;i++){
            System.out.println(list.get(i).key+" "+list.get(i).value);
        System.out.println();
        }


    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            sc.nextLine();
            Map<String,Integer> map = new HashMap<>();
            List<SearchEngine> list = new ArrayList<>();
            while(n>0){
                String tmp = sc.nextLine();
                if(tmp.contains("top")){
                    printTopNItems(tmp,list);
                }else{
                    createFilterList(tmp,list,map);
                }
                n =n-1;
            }
            map.clear();
            list.clear();
            t=t-1;
        }
    }
}
