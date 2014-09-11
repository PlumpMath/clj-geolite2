This is so very barebones and untested outside of GeoLite2 "City" database but every repo has to start somewhere right?

```clojure
lein run 128.101.101.101 /path/to/the/GeoLite2-City.mmdb 
{:ip 128.101.101.101, :countryCode United States, :countryName United States, :city Minneapolis, :postalCode 55414, :latitude 44.9759, :longitude -93.2166}
```

## License

Copyright © 2014 Adam Neilson

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
