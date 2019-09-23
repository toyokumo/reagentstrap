# Reagentstrap

A interface between [Reagent](https://github.com/reagent-project/reagent) and [Reactstrap](https://github.com/reactstrap/reactstrap).

[![Clojars Project](https://img.shields.io/clojars/v/reagentstrap.svg)](https://clojars.org/reagentstrap)
[![cljdoc badge](https://cljdoc.org/badge/reagentstrap)](https://cljdoc.org/d/reagentstrap/CURRENT)

## Usage

```clojure
(:require '[reagent.core :as reagent]
          '[reagentstrap.core :as r])

(defn- nav-component []
  [r/Navbar {:color "dark" :dark true}
   [r/NavbarBrand {:href "/"} "Reagentstrap"]
   [r/Nav {:class "mr-auto"}
    [r/NavItem [r/NavLink {:href "/menu1"} "Menu1"]]]])

(defn- card-component []
  [r/Row
   [r/Col
    [r/Card
     [r/CardBody
      [r/CardTitle "Card title"]
      [r/CardSubtitle "Card subtitle"]
      [r/CardText "Some quick example text to build on the card title and make up the bulk of the card's content."]]]]])

(defn- main-component []
  [:<>
   [r/Container {:fluid true}
    [nav-component]]
   [r/Container
    [card-component]]])

(defn main []
  (reagent/render [main-component] (.getElementById js/document "app")))
```

More usage examples of the UI components can be found in [dev/cljs/user.cljs](dev/cljs/user.cljs).
For building [Leiningen](https://leiningen.org) is required.

The dev mode is started with

```shell script
$ lein repl
user=> (fig-start)
[Figwheel] Compiling build dev to "target/public/js/main.js"
[Figwheel] Successfully compiled build dev to "target/public/js/main.js" in 0.445 seconds.
[Figwheel] Watching paths: ("src" "dev") to compile build - dev
[Figwheel] Starting Server at http://localhost:9500
Opening URL http://localhost:9500
nil
```

then opening http://localhost:9500/ automatically.

## License

Copyright 2019 TOYOKUMO,Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
