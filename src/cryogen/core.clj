(ns cryogen.core
  (:require [cryogen-core.compiler :refer [compile-assets-timed]]
            [cryogen-core.plugins :refer [load-plugins]]
            [environ.core :refer [env]]))

(defn -main []
  (load-plugins)
  (compile-assets-timed (if (env :sass-path) {:sass-path (env :sass-path)} {}))
  (System/exit 0))
