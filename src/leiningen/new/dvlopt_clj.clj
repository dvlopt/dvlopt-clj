(ns leiningen.new.dvlopt-clj
  (:require [leiningen.core.main     :as main]
            [leiningen.new.templates :as templ]))




(def render (templ/renderer "dvlopt-clj"))



(defn dvlopt-clj

  "Generate the template"

  [project-name]

  (let [data {:name      project-name
              :sanitized (templ/name-to-path project-name)}]
    (main/info (str "Generating a new kickass awesome project called \"" project-name "\""
                    \newline
                    "Dreams will come true !"))
    (templ/->files data
                   [".gitignore"
                    (render ".gitignore")]
                   ["LICENSE"
                    (render "LICENSE")]
                   ["README.md"
                    (render "README.md"
                            data)]
                   ["CHANGELOG.md"
                    (render "CHANGELOG.md")]
                   ["project.clj"
                    (render "project.clj"
                            data)]
                   ["dev/user.clj"
                    (render "user.clj"
                            data)]
                   ["src/{{sanitized}}/core.clj"
                    (render "core.clj"
                            data)])))
