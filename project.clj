(defproject nerd-recipes "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [org.clojure/java.jdbc "0.7.3"]
                 [org.postgresql/postgresql "42.1.4"]
                 [clojure.jdbc/clojure.jdbc-c3p0 "0.3.3"]
                 [com.layerware/hugsql "0.4.8"]]
  :plugins [[lein-ring "0.9.7"]
            [drift "1.5.2"]]
  :ring {:handler nerd-recipes.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]
                        [drift "1.5.2"]]
         :plugins [[lein-auto "0.1.3"]
                   [lein-cljfmt "0.5.7"]]}})
