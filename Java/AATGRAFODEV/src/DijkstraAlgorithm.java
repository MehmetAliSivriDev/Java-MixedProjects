import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraAlgorithm {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graf = new HashMap<>();
            graf.put("BulundugumuzNokta", Map.of("SaglikNoktasi(Stok:35)", 100, "SaglikNoktasi2(Stok:35)", 300));
            graf.put("SaglikNoktasi(Stok:35)", Map.of("BulundugumuzNokta", 100, "SaglikNoktasi2(Stok:35)", 100, "SaglikNoktasi3(Stok:30)", 200));
            graf.put("SaglikNoktasi2(Stok:35)", Map.of("BulundugumuzNokta", 300, "SaglikNoktasi(Stok:35)", 100, "SaglikNoktasi3(Stok:30)", 100, "TemelGida(Stok:35)", 500));
            graf.put("SaglikNoktasi3(Stok:30)", Map.of("SaglikNoktasi(Stok:35)", 200, "SaglikNoktasi2(Stok:35)", 100, "TemelGida(Stok:35)", 100, "TemelGida2(Stok:35)", 300));
            graf.put("TemelGida(Stok:35)", Map.of("SaglikNoktasi2(Stok:35)", 500, "SaglikNoktasi3(Stok:30)", 100, "TemelGida2(Stok:35)", 200, "TemelGida3(Stok:30)", 400));
            graf.put("TemelGida2(Stok:35)", Map.of("SaglikNoktasi3(Stok:30)", 300, "TemelGida(Stok:35)", 200, "TemelGida3(Stok:30)", 100, "IsinmaGereci(Stok:35)", 200));
            graf.put("TemelGida3(Stok:30)", Map.of("TemelGida(Stok:35)", 400, "TemelGida2(Stok:35)", 100, "IsinmaGereci(Stok:35)", 100, "IsinmaGereci2(Stok:35)", 300));
            graf.put("IsinmaGereci(Stok:35)", Map.of("TemelGida2(Stok:35)", 200, "TemelGida3(Stok:30)", 1, "IsinmaGereci2(Stok:35)", 1, "Giyecek(Stok:35)", 2));
            graf.put("IsinmaGereci2(Stok:35)", Map.of("TemelGida3(Stok:30)", 300, "IsinmaGereci(Stok:35)", 100, "Giyecek(Stok:35)", 100));
            graf.put("Giyecek(Stok:35)", Map.of("IsinmaGereci(Stok:35)", 200, "IsinmaGereci2(Stok:35)", 100, "Giyecek2(Stok:35)", 300));
            graf.put("Giyecek2(Stok:35)", Map.of("Giyecek(Stok:35)", 300));

        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        Map<String, Integer> maliyet = dijkstra.dijkstra(graf, "BulundugumuzNokta");

        for (Map.Entry<String, Integer> entry : maliyet.entrySet()) {
            System.out.println(entry.getKey() + "'ya Uzaklik: " + entry.getValue() + "(m)");
        }
    }

    public Map<String, Integer> dijkstra(Map<String, Map<String, Integer>> graf, String baslangic) {
        // Başlangıç düğümüne maliyet sıfır olarak atanır
        Map<String, Integer> maliyet = new HashMap<>();
        for (String key : graf.keySet()) {
            maliyet.put(key, 1500);
        }
        maliyet.put(baslangic, 0);

        // Daha önce ziyaret edilmeyen düğümleri heap'e ekleyin
        PriorityQueue<Tuple2<Integer, String>> heap = new PriorityQueue<>(
                (a, b) -> a.getItem1().compareTo(b.getItem1())
        );
        heap.add(new Tuple2<>(0, baslangic));

        while (!heap.isEmpty()) {
            String aktif = heap.remove().getItem2();

            // Düğümün komşularını gezin
            for (String komsu : graf.get(aktif).keySet()) {
                int yeniMaliyet = maliyet.get(aktif) + graf.get(aktif).get(komsu);

                // Daha düşük bir maliyet bulunduysa, bunu kaydet ve heap'e ekleyin
                if (yeniMaliyet < maliyet.get(komsu)) {
                    maliyet.put(komsu, yeniMaliyet);
                    heap.add(new Tuple2<>(yeniMaliyet, komsu));
                }
            }
        }

        return maliyet;
    }
}

class Tuple2<T1, T2> {
    private final T1 item1;
    private final T2 item2;

    public Tuple2(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public T1 getItem1() {
        return item1;
    }

    public T2 getItem2() {
        return item2;
    }
}
