(defproject anglican-user "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [nstools "0.2.4"]
                 [anglican "0.8.0"]]
  :plugins [[dtolpin/lein-gorilla "0.3.6-SNAPSHOT"]]
  :resource-paths ["programs"]
  :main ^:skip-aot template)
