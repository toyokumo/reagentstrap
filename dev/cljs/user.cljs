(ns cljs.user
  (:require [reagent.core :as reagent]
            [reagentstrap.core :as r]))

(defn- nav-component []
  [r/Navbar {:color "dark" :dark true}
   [r/NavbarBrand {:href "/"} "Reagentstrap"]
   [r/Nav {:class "mr-auto"}
    [r/NavItem [r/NavLink {:href "/menu1"} "Menu1"]]]])

(defn- alert-component []
  [r/Row
   [r/Col {:md 12} [:h2 "Alert"]]
   [r/Col [r/Alert {:color "primary"} "foo"]]
   [r/Col [r/Alert {:color "secondary"} "bar"]]
   [r/Col [r/Alert {:color "success"} "baz"]]])

(defn- badge-component []
  [r/Row
   [r/Col
    [r/Button {:color "primary" :outline true}
     "Notifications " [r/Badge {:color "secondary"} 4]]]])

(defn- breadcrumb-component []
  [r/Row
   [r/Col
    [r/Breadcrumb
     [r/BreadcrumbItem "foo"]
     [r/BreadcrumbItem "bar"]
     [r/BreadcrumbItem {:active true} "baz"]]]])

(defn- dropdown-component []
  (let [open? (reagent/atom false)]
    (fn []
      [r/Row
       [r/Col
        [r/Dropdown {:is-open @open? :toggle (fn [] (reset! open? (not @open?)))}
         [r/DropdownToggle {:caret true} "Button Dropdown"]
         [r/DropdownMenu
          [r/DropdownItem "foo"] [r/DropdownItem "bar"] [r/DropdownItem "baz"]]]]])))

(defn- button-component []
  [r/Row
   [r/Col
    [r/Button {:color "primary"} "primary"]
    [r/Button {:color "info"} "info"]
    [r/Button {:color "danger"} "danger"]]])

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
    [alert-component]
    [badge-component]
    [breadcrumb-component]
    [dropdown-component]
    [button-component]
    [card-component]]])

(defn main []
  (reagent/render [main-component] (.getElementById js/document "app")))

(main)
