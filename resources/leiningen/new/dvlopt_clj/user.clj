(ns user
  (:require [clojure.tools.namespace.repl :as repl]
            ;[clojure.spec                :as s]
            ;[clojure.spec.gen            :as gen]
            ;[clojure.spec.test           :as stest]
            [{{ name }}.core :as c])
  (:gen-class))




(def rl
     "Reload modified namespaces"
     repl/refresh)


(def rla
     "Reload all namespaces"
     repl/refresh-all)




(comment
  
  

  )
