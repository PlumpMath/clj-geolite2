This is so very barebones and untested outside of GeoLite2 "City" database but every repo has to start somewhere right?

To run:

Make sure you have Leiningen installed (why *wouldn't* you have it installed?!?) 

`cd /to/the/root/dir/clj-geolite2`

Then simply run lein supplying two arguments: The IP address you are querying and the path to the MaxMind GeoLite2 City database file. Like this:

```clojure
lein run 128.101.101.101 /path/to/the/GeoLite2-City.mmdb 
{:ip 128.101.101.101, :countryCode United States, :countryName United States, :city Minneapolis, :postalCode 55414, :latitude 44.9759, :longitude -93.2166}
```

You get back a map with all the available data for that IP address.

## License

Copyright © 2014 Adam Neilson

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
