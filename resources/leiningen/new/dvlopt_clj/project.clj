(defproject {{ name }}
            "0.0.0-alpha0"

  :description  " ? "
  :url          " ? "
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :main         {{ name }}.core
  :dependencies [[org.clojure/clojure "1.9.0-RC1"]]
  :profiles     {:dev     {:source-paths ["dev"]
                           :main         user
                           :dependencies [[org.clojure/test.check "0.10.0-alpha2"]
                                          [criterium              "0.4.4"]]
                           :plugins      [[venantius/ultra "0.5.1"]
                                          [lein-codox      "0.10.3"]]
                           :codox        {:output-path  "doc/auto"
                                          :source-paths ["src"]}
                           :global-vars  {*warn-on-reflection* true}}
                 :uberjar {:aot :all}})
