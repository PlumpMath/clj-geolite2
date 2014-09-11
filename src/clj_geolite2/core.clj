(ns clj-geolite2.core
  (:import
    [com.maxmind.geoip2 
     DatabaseReader
     DatabaseReader$Builder]
    [java.net InetAddress]
    [java.io File])
  (:gen-class))



(defn get-location-map "doc-string" [ip-addr db-file-path]
  (try
    (def host ip-addr)
    (def db-file (File. db-file-path))
    (if-let [builder (DatabaseReader$Builder. db-file)]
      (if-let [reader (.build builder)]
        (if-let [addr (InetAddress/getByName host)]
          (if-let [response (-> reader
                                (.city addr))]
            {:ip host
             :countryCode (-> response (.getCountry) (.getName))
             :countryName (-> response (.getCountry) (.getName))
             :city (-> response (.getCity) (.getName))
             :postalCode (-> response (.getPostal) (.getCode))
             :latitude (-> response (.getLocation) (.getLatitude))
             :longitude (-> response (.getLocation) (.getLongitude))}))))
    (catch Exception e (println "Exception getting location map:" (.getMessage e)))))




(defn -main
  "Basic proof of concept for interop with Maxmind GeoLite2 City available from 
  http://dev.maxmind.com/geoip/geoip2/geolite2/.

  Two arguments should be supplied:
    1) The IP address in question
    2) The /path/to/the/GeoLite2-City.mmdb database"
  [& args]

  (if (not (= (count args) 2))
    (println "Two arguments should be supplied:
             1) The IP address in question
             2) The /path/to/the/GeoLite2-City.mmdb database")

    (println (get-location-map (first args) (second args)))))


