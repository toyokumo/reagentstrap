(ns reagentstrap.core
  (:require [cljsjs.reactstrap]
            [goog.object :as go]
            [reagent.core :as r]))

(def reactstrap js/Reactstrap)

(defn- adapt [k]
  (r/adapt-react-class (go/get reactstrap k)))

(def Container (adapt "Container"))
(def Row (adapt "Row"))
(def Col (adapt "Col"))
(def Navbar (adapt "Navbar"))
(def NavbarBrand (adapt "NavbarBrand"))
(def NavbarToggler (adapt "NavbarToggler"))
(def Nav (adapt "Nav"))
(def NavItem (adapt "NavItem"))
(def NavDropdown (adapt "NavDropdown"))
(def NavLink (adapt "NavLink"))
(def Breadcrumb (adapt "Breadcrumb"))
(def BreadcrumbItem (adapt "BreadcrumbItem"))
(def Button (adapt "Button"))
(def ButtonDropdown (adapt "ButtonDropdown"))
(def ButtonGroup (adapt "ButtonGroup"))
(def ButtonToolbar (adapt "ButtonToolbar"))
(def Dropdown (adapt "Dropdown"))
(def DropdownItem (adapt "DropdownItem"))
(def DropdownMenu (adapt "DropdownMenu"))
(def DropdownToggle (adapt "DropdownToggle"))
(def Fade (adapt "Fade"))
(def Badge (adapt "Badge"))
(def Card (adapt "Card"))
(def CardGroup (adapt "CardGroup"))
(def CardDeck (adapt "CardDeck"))
(def CardColumns (adapt "CardColumns"))
(def CardBody (adapt "CardBody"))
(def CardBlock (adapt "CardBlock"))
(def CardLink (adapt "CardLink"))
(def CardFooter (adapt "CardFooter"))
(def CardHeader (adapt "CardHeader"))
(def CardImg (adapt "CardImg"))
(def CardImgOverlay (adapt "CardImgOverlay"))
(def Carousel (adapt "Carousel"))
(def UncontrolledCarousel (adapt "UncontrolledCarousel"))
(def CarouselControl (adapt "CarouselControl"))
(def CarouselItem (adapt "CarouselItem"))
(def CarouselIndicators (adapt "CarouselIndicators"))
(def CarouselCaption (adapt "CarouselCaption"))
(def CardSubtitle (adapt "CardSubtitle"))
(def CardText (adapt "CardText"))
(def CardTitle (adapt "CardTitle"))
(def CustomInput (adapt "CustomInput"))
(def PopperContent (adapt "PopperContent"))
(def PopperTargetHelper (adapt "PopperTargetHelper"))
(def Popover (adapt "Popover"))
(def UncontrolledPopover (adapt "UncontrolledPopover"))
(def PopoverHeader (adapt "PopoverHeader"))
(def PopoverTitle (adapt "PopoverTitle"))
(def PopoverBody (adapt "PopoverBody"))
(def PopoverContent (adapt "PopoverContent"))
(def Progress (adapt "Progress"))
(def Modal (adapt "Modal"))
(def ModalHeader (adapt "ModalHeader"))
(def ModalBody (adapt "ModalBody"))
(def ModalFooter (adapt "ModalFooter"))
(def Tooltip (adapt "Tooltip"))
(def Table (adapt "Table"))
(def ListGroup (adapt "ListGroup"))
(def Form (adapt "Form"))
(def FormFeedback (adapt "FormFeedback"))
(def FormGroup (adapt "FormGroup"))
(def FormText (adapt "FormText"))
(def Input (adapt "Input"))
(def InputGroup (adapt "InputGroup"))
(def InputGroupAddon (adapt "InputGroupAddon"))
(def InputGroupButton (adapt "InputGroupButton"))
(def InputGroupButtonDropdown (adapt "InputGroupButtonDropdown"))
(def InputGroupText (adapt "InputGroupText"))
(def Label (adapt "Label"))
(def Media (adapt "Media"))
(def Pagination (adapt "Pagination"))
(def PaginationItem (adapt "PaginationItem"))
(def PaginationLink (adapt "PaginationLink"))
(def TabContent (adapt "TabContent"))
(def TabPane (adapt "TabPane"))
(def Jumbotron (adapt "Jumbotron"))
(def Alert (adapt "Alert"))
(def Collapse (adapt "Collapse"))
(def ListGroupItem (adapt "ListGroupItem"))
(def ListGroupItemHeading (adapt "ListGroupItemHeading"))
(def ListGroupItemText (adapt "ListGroupItemText"))
(def UncontrolledAlert (adapt "UncontrolledAlert"))
(def UncontrolledButtonDropdown (adapt "UncontrolledButtonDropdown"))
(def UncontrolledCollapse (adapt "UncontrolledCollapse"))
(def UncontrolledDropdown (adapt "UncontrolledDropdown"))
(def UncontrolledNavDropdown (adapt "UncontrolledNavDropdown"))
(def UncontrolledTooltip (adapt "UncontrolledTooltip"))
(def Spinner (adapt "Spinner"))
