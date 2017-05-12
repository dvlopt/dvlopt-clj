(defproject {{ name }}
            "0.0.0-alpha0"
  :description  "<!> Developer is too lazy to write a description"
  :url          "Missing, maybe there is no website yet ?"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins      [[lein-codox "0.10.3"]]
  :codox        {:output-path "doc/auto"}
  :main         {{ name }}.core
  :dependencies [[org.clojure/clojure "1.9.0-alpha16"]
                 ]
  :profiles     {:dev     {:source-paths ["dev"]
                           :main         user
                           :plugins      [[mvxcvi/whidbey "1.3.1"]]
                           :whidbey      {:color-scheme {:keyword         [:green]
                                                         :boolean         [:bold :yellow]
                                                         :character       [:white]
                                                         :string          [:white]
                                                         :symbol          [:bold :magenta]
                                                         :nil             [:bold :cyan]}}
                           :dependencies [[org.clojure/tools.namespace "0.2.11"]
                                          [org.clojure/test.check "0.9.0"]
                                          [criterium "0.4.4"]
                                          ]
                           :global-vars  {*warn-on-reflection* true}}
                 :uberjar {:aot :all}})
