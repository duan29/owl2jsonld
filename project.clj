(defproject owl2jsonld "0.1.0-SNAPSHOT"
  :description "Convert RDFS/OWL ontology to JSON-LD context"
  :url "https://github.com/stain/owl2jsonld"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"] 
                 [owlapi-clj "1.1.0-SNAPSHOT"]
                 [cheshire "5.3.1"]
                 [org.clojure/tools.cli "0.3.1"]
                ]
  :main ^:skip-aot owl2jsonld.app
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
