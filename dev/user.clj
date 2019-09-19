(ns user
  (:require [figwheel.main.api :as fig]
            [clojure.string :as str]))

(defn fig-start []
  (fig/start "dev"))

(defn fig-stop []
  (fig/stop "dev"))

(defn fig-prod-start []
  (fig/start "prod"))

(defn fig-prod-stop []
  (fig/stop "prod"))

(defn cljs-repl []
  (fig/cljs-repl "dev"))

(comment
 (->> (slurp "https://raw.githubusercontent.com/reactstrap/reactstrap/7.1.0/src/index.js")
      (str/split-lines)
      (filter #(re-matches #"export [A-z].*" %))
      (map #(nth (str/split % #" ") 1))
      (map (fn [s] (str "(def " s " (adapt \"" s "\"))")))
      (str/join "\n")
      (spit "/tmp/out.txt")))
