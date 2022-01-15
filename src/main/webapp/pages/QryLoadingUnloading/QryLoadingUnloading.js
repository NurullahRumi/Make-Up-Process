Application.$controller("QryLoadingUnloadingPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets/variables within this block */
    $scope.onPageReady = function() {
        /*
         * variables can be accessed through '$scope.Variables' property here
         * e.g. to get dataSet in a staticVariable named 'loggedInUser' use following script
         * $scope.Variables.loggedInUser.getData()
         *
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
        $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = $scope.pageParams.pOrdnum;
        if ($scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue !== "" && $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue !== null && $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue !== undefined) {
            $scope.Variables.svProcMK1100PK0_GetGmtColourDetails.invoke();
        }
    };
    //----------------------------------------------------------------------------------------------------

    $scope.button3Click = function($event, $isolateScope) {
        var m_Ordnum = $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue;

        if (m_Ordnum == "" || m_Ordnum == null || m_Ordnum == undefined) {
            $scope.Variables.notifMsg.setMessage("Order No is required to query");
            $scope.Variables.notifMsg.notify();
            $scope.Widgets.formFilter.submit = false;
            return false;

        }
        $scope.Variables.svProcMK1100PK0_GetGmtColourDetails.invoke();

    };

    //----------------------------------------------------------------------------------------------------
    $scope.button1Click = function($event, $isolateScope) {

        $scope.Variables.svProcMK1100PK0_GetGmtColourDetails.dataSet = null;
        $scope.Variables.svProcMK1100PK0_MK440GetordLoadunldqty.dataSet = null;
        $scope.Variables.svProcMK1100PK0_MK400JobLoadpersze.dataSet = null;
        $scope.Variables.svProcMK1100PK0_MK450JobUnloadpersze.dataSet = null;
        $scope.Variables.svProcMK1100PK0_MK560QryMkrejects.dataSet = null;
        //$scope.Variables.svProcMK1100PK0_GetOrt150Size.dataSet = null;

    };
    //---------------------------------------------------------------------------------------------------
    $scope.pOrdnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = newVal.toUpperCase();
    };
    //----------------------------------------------------------------------------------------------------
    $scope.pGmtseqClick = function($event, $isolateScope) {
        $scope.Widgets.formFilter.formWidgets.pGmtseq.datavalue = newVal.toUpperCase();
    };

    //----------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_GetOrt150SizeonBeforeUpdate = function(variable, inputData) {

        // if user has access to loading or unloading only then fetch sizes. other tab panes do not use sizes
        if ($scope.Widgets.tabpaneLoading == undefined && $scope.Widgets.tabpaneUnloading == undefined) {
            return false;
        }

        if (inputData.pOrdnum == undefined) {
            return false;
        }
    };
    //---------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_MK400JobLoadperszeonBeforeUpdate = function(variable, inputData) {
        //console.log("Load is active --" + $scope.Widgets.tabpaneLoading.isActive);
        //user does not have access, do not query
        if ($scope.Widgets.tabpaneLoading == undefined) {
            return false;
        }

        if ($scope.Widgets.tabpaneLoading.isActive !== true) {
            return false;
        }

        if (inputData.pOrdnum == undefined || inputData.pGmtseq == undefined || inputData.pClrseqg == undefined) {
            return false;
        }
    };
    //---------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_MK450JobUnloadperszeonBeforeUpdate = function(variable, inputData) {
        // console.log("Unload is active --" + $scope.Widgets.tabpaneUnloading.isActive);

        if ($scope.Widgets.tabpaneUnloading == undefined) {
            return false;
        }


        // if there are multiple tabs, differ querying until tab sheet "unload" is clicked
        if ($scope.Widgets.tabpaneUnloading.isActive !== true) {
            return false;
        }


        if (inputData.pOrdnum == undefined || inputData.pGmtseq == undefined || inputData.pClrseqg == undefined) {
            return false;
        }
    };
    //---------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_MK560QryMkrejectsonBeforeUpdate = function(variable, inputData) {
        // console.log("Rejects is active --" + $scope.Widgets.tabpaneRejects.isActive);
        if ($scope.Widgets.tabpaneRejects == undefined) {
            return false;
        }

        if ($scope.Widgets.tabpaneRejects.isActive !== true) {
            return false;
        }

        if (inputData.pOrdnum == undefined || inputData.pGmtseq == undefined || inputData.pClrseqg == undefined) {
            return false;
        }
    };
    //---------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_MK440GetordLoadunldqtyonBeforeUpdate = function(variable, inputData) {
        if ($scope.Widgets.tabpaneLoadUnload == undefined) {
            return false;
        }
        if ($scope.Widgets.tabpaneLoadUnload.isActive !== true) {
            return false;
        }
        if (inputData.pOrdnum == undefined || inputData.pGmtseq == undefined || inputData.pClrseqg == undefined) {
            return false;
        }
    };

    //------------------------------------------------------------------------------------------------------------------------------------------------------
    // on change of tab panes, query the appropriate service
    $scope.tabs1Change = function($event, $isolateScope, newPaneIndex, oldPaneIndex) {

        var tabpaneName = $scope.Widgets.tabs1.tabs[newPaneIndex]._initState.name.toUpperCase();

        //console.log($scope.Widgets.tabs1.tabs[newPaneIndex]);
        //    console.log(tabpaneName);

        // tab pane Loading
        if (tabpaneName == "TABPANELOADING") {
            $scope.Variables.svProcMK1100PK0_MK400JobLoadpersze.invoke();
        }

        // tab pane Unloading
        else if (tabpaneName == "TABPANEUNLOADING") {
            $scope.Variables.svProcMK1100PK0_MK450JobUnloadpersze.invoke();
        }

        // tab pane Load vs Unload
        else if (tabpaneName == "TABPANELOADUNLOAD") {
            $scope.Variables.svProcMK1100PK0_MK440GetordLoadunldqty.invoke();
        }

        // tab pane MKup rejects
        else if (tabpaneName == "TABPANEREJECTS") {
            $scope.Variables.svProcMK1100PK0_MK560QryMkrejects.invoke();
        }
    };
    //--------------------------------------------------------------------------------------------------------------------------------------------
}]);

Application.$controller("gridOrderLoadvsUnloadController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        $scope.customFieldAction = function(selectedItemData) {
            $scope.Widgets.dialogQtyPerOrder.open();
        };

    }
]);

Application.$controller("dialogQtyPerOrderController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("gridMasterController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("gridLoadingController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("gridUnloadController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);

Application.$controller("gridRejectController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);