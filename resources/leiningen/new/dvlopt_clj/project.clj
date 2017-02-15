(defproject {{ name }}
            "0.0.0-alpha0"
  :description  "<!> Developer is too lazy to write a description"
  :url          "Missing, maybe there is no website yet ?"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-codox "0.10.3"]]
  :codox        {:output-path "doc/auto"}
  :main         {{ name }}.core
  :dependencies [[org.clojure/clojure "1.9.0-alpha10"]
                 ]
  :profiles     {:dev     {:source-paths ["dev"]
                           :main         user
                           :plugins      [[venantius/ultra "0.4.1"]                ;; colorful repl
                                          ]
                           :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                          ;[org.clojure/test.check "0.9.0"]]
                                          ]}
                 :uberjar {:aot :all}})
