(ns user
  (:require [clojure.tools.namespace.repl :as repl]
            [clojure.spec.alpha           :as s]
            [clojure.spec.gen.alpha       :as gen]
            [clojure.spec.test.alpha      :as stest]
            [criterium.core               :as ct]
            [{{ name }}.core :as c]))




(def rl
     "Reload modified namespaces"
     repl/refresh)


(def rla
     "Reload all namespaces"
     repl/refresh-all)




(comment
  
  

  )
