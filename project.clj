(defproject cryogen "0.1.0"
            :description "Simple static site generator"
            :url "https://github.com/lacarmen/cryogen"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.10.1"]
                           [ring/ring-devel "1.8.2"]
                           [compojure "1.6.3"]
                           [ring-server "0.5.0"]
                           [cryogen-flexmark "0.1.5"]
                           [cryogen-core "0.4.1"]
                           [environ "1.2.0"]]
            :plugins [[lein-ring "0.12.5"]
                      [lein-environ "1.2.0"]]
            :main cryogen.core
            :ring {:init cryogen.server/init
                   :handler cryogen.server/handler}
            :aliases {"serve"      ["run" "-m" "cryogen.server"]
                      "serve-fast" ["run" "-m" "cryogen.server" "fast"]}
            :profiles {:prod {:env {:sass-path "/tmp/sass/dart-sass/sass"}}})
