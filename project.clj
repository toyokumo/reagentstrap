(defproject reagentstrap "0.0.1-SNAPSHOT"
  :description "Library for using Reactstrap with Reagent"
  :url "https://github.com/toyokumo/reagentstrap"
  :license {:name "Apache, Version 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :deploy-repositories [["releases" {:url "https://repo.clojars.org" :creds :gpg}]
                        ["snapshots" :clojars]]
  :clean-targets ^{:protect false} ["target"]
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [cljsjs/reactstrap "7.1.0-0"]]
  :profiles {:provided {:dependencies [[org.clojure/clojurescript "1.10.520"]
                                       [reagent "0.8.1"]]}
             :dev {:source-paths ["dev"]
                   :resource-paths ["target"]
                   :dependencies [[nrepl/nrepl "0.6.0"]
                                  [cider/piggieback "0.4.1"]
                                  [com.bhauman/figwheel-main "0.2.3"]]
                   :repl-options {:nrepl-middleware [cider.piggieback/wrap-cljs-repl]}}})
