import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Task_5 implements Task_5_base {
    @Override
    public ArrayList<Integer> subtask_1_ArrayList(ArrayList<Integer> data, int k, int n) {
        // Выбрать из данного списка элементы, кратные k, но не кратные n
        // и сформировать из них новый список.
        // Вернуть новый список в качестве результата
        ArrayList<Integer> my_list = new ArrayList<>(data);
        my_list.removeIf(integer -> ((integer % k != 0) || (integer % n == 0)));
        return my_list;
    }

    @Override
    public ArrayList<Integer> subtask_2_ArrayList(int size) {
        // сгенерировать и вернуть список размера size,
        // содержащий первые size элементов последовательности, описанной в
        // задаче subtask_2_for задания task_3
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0, cur = 1, pos = 0; i < size; i++) {
            list.add(cur);
            pos++;
            if (pos == cur) {
                cur += 1;
                pos = 0;
            }
        }
        return list;
    }

    @Override
    public HashSet<Integer> subtask_3_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите пересечение множеств s1 и s2
        HashSet<Integer> temp = new HashSet<>(s2);
        temp.removeAll(s1);
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.removeAll(temp);
        temp.clear();
        return s3;
    }

    @Override
    public HashSet<Integer> subtask_4_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите объединение множеств s1 и s2
        HashSet<Integer> s3 = new HashSet<>(s1);
        s3.addAll(s2);
        return s3;
    }

    @Override
    public HashSet<Integer> subtask_5_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // найдите дополнение множества s1 до множества s2
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.removeAll(s1);
        return s3;
    }

    @Override
    public HashSet<Integer> subtask_6_HashSet(HashSet<Integer> s1, HashSet<Integer> s2) {
        // постройте множество, содержащее элементы, содержащиеся либо только в s1,
        // либо только в s2, но не в обоих множествах одновременно
        HashSet<Integer> temp = new HashSet<>(s1);
        temp.removeAll(s2);
        HashSet<Integer> s3 = new HashSet<>(s2);
        s3.removeAll(s1);
        s3.addAll(temp);
        temp.clear();
        return s3;
    }

    @Override
    public HashMap<String, Double> subtask_7_HashMap(ArrayList<String> data) {
        // Дан список строк. Построить словарь, содержащий частоты слов
        // для данного списка в процентах
        HashMap<String,Double> type = new HashMap<>();
        double r;
        for (int i =0;i < data.size();i++) {
            r = 0;
            for(int j=0;j< data.size(); j++) {
                if (data.get(i) == data.get(j)) r++;
            }
            type.put(data.get(i), r/data.size()*100);
        }
        return type;
    }

    @Override
    public HashMap<String, Double> subtask_8_HashMap(ArrayList<Double> data) {
        // Дан список чисел. Сформировать словарь, содержащий среднее,
        // максимальное и минимальное значения из данного списка. Ключи
        // словаря "mean", "max", "min" соответственно
        double max = data.get(0), min = data.get(0), mean = 0, size = data.size();

        HashMap<String, Double> map = new HashMap<>();
        for (Double datum: data){
            mean+=datum;
            if (datum>max)
                max=datum;
            else if (datum<min)
                min=datum;
        }

        map.put("mean",mean/size);
        map.put("max",max);
        map.put("min",min);
        return map;
    }
}
