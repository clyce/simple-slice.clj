(ns simple-slice.core)

(defn -main [& args]
  (with-open [rf (clojure.java.io/reader (first args))]
    (let [slices (read-string (second args))]
      (loop [n 0]
        (if (= n slices) 0
          (do 
            (spit (str (first args) "-" n) 
                  (take-nth slices (drop n (line-seq rf))))
            (recur (inc n))))))))
