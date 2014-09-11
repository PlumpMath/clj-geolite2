(defproject clj-geolite2 "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.maxmind.geoip2/geoip2 "0.9.0"]]
  :main ^:skip-aot clj-geolite2.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
