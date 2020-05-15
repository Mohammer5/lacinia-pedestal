(defproject com.walmartlabs/lacinia-pedestal "0.14.0-alpha-1"
  :description "Pedestal infrastructure supporting Lacinia GraphQL"
  :url "https://github.com/walmartlabs/pedestal-lacinia"
  :license {:name "Apache Software License 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.walmartlabs/lacinia "0.36.0"]
                 [com.fasterxml.jackson.core/jackson-core "2.10.2"]
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.jetty "0.5.7"]
                 [org.clojure/data.json "1.0.0"]]
  :profiles
  {:dev {:dependencies [[clj-http "2.3.0"]
                        [com.walmartlabs/test-reporting "0.1.0"]
                        [expound "0.8.4"]
                        [stylefruits/gniazdo "1.1.3"
                         :exclusions [org.eclipse.jetty.websocket/websocket-client]]
                        [io.aviso/logging "0.3.2"]]}}
  :jvm-opts ["-Xmx500m"]
  :plugins [[lein-codox "0.10.7"]
            [test2junit "1.3.0"]
            [lein-shell "0.5.0"]]
  :shell {:dir "resources/graphiql"}
  :prep-tasks [["shell" "./build"]]
  :jar-exclusions [#"graphiql/node_.*"
                   #"graphiql/build"
                   #"graphiql/package.json"
                   #".*/\.DS_Store"]
  :codox {:source-uri "https://github.com/walmartlabs/pedestal-lacinia/blob/master/{filepath}#L{line}"
          :metadata {:doc/format :markdown}})
