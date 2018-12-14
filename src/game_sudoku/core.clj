(ns game-sudoku.core
  (:gen-class))

(defn gen-grid []
 "(flatten (nth (nth ... ?) 0..2)) -> square-x"
 [[[5 3 0] [0 7 0] [0 0 0]]
  [[6 0 0] [1 9 5] [0 0 0]]
  [[0 9 8] [0 0 0] [0 6 0]]

  [[8 0 0] [0 6 0] [0 0 3]]
  [[4 0 0] [8 0 3] [0 0 1]]
  [[7 0 0] [0 2 0] [0 0 6]]

  [[0 6 0] [0 0 0] [2 8 0]]
  [[0 0 0] [4 1 9] [0 0 5]]
  [[0 0 0] [0 8 0] [0 7 9]]])

(defn gen-grids []
  [5 3 0 0 7 0 0 0 0
   6 0 0 1 9 5 0 0 0
   0 9 8 0 0 0 0 6 0
   8 0 0 0 6 0 0 0 3
   4 0 0 8 0 3 0 0 1
   7 0 0 0 2 0 0 0 6
   0 6 0 0 0 0 2 8 0
   0 0 0 4 1 9 0 0 5
   0 0 0 4 1 9 0 0 5])

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (partition 9 (flatten (flatten (gen-grid))))))

;;(defn check-horizontal [square-x square-y grid-x grid-y]
  
