(ns brave-clojure.chapter-3)

(defn exercise-1
  "Use the str, vector, list, hash-map, and hash-set functions."
  [invader native]
  (str invader " invades "
       (apply str
         (interpose ", " (drop-last native)))
         " and "
         (last native)))


(comment
  (exercise-1 "Putin" (vector "Ukrain" "Georgia" "Syria"))
  (exercise-1 "Putin" (list "Ukrain" "Georgia" "Syria")))
