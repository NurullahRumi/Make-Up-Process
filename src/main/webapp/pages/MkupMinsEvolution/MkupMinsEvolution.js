Application.$controller("MkupMinsEvolutionPageController", ["$scope", function($scope) {
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
        if ($scope.pageParams.pParam1 !== undefined && $scope.pageParams.pParam1.length > 0) {
            $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = $scope.pageParams.pParam1;
        }

        if ($scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue !== "" && $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue !== null && $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue !== undefined) {

            //$scope.Widgets.formFilter.submit();
            $scope.Variables.svProcMK1100PK0_QryMK721Prodmins.invoke();
        }
    };


    $scope.btnQueryClick = function($event, $isolateScope) {
        var m_Ordnum = $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue;
        var m_Unit = $scope.Widgets.formFilter.formWidgets.pMaklcn.datavalue;
        var m_Paddate = $scope.Widgets.formFilter.formWidgets.pProddate.datavalue;

        if ((m_Ordnum == "" || m_Ordnum == null || m_Ordnum == undefined || m_Ordnum == '%' || m_Ordnum.length <= 4) && (m_Unit == "" || m_Unit == null || m_Unit == undefined)) {
            $scope.Variables.notifMsg.setMessage("Type an Order number or Unit to query");
            $scope.Variables.notifMsg.notify();
            return false;
        }

        if (m_Unit !== undefined && m_Unit !== "" && m_Unit !== null && (m_Ordnum == "" || m_Ordnum == null || m_Ordnum == undefined || m_Ordnum == '%')) {
            if (m_Paddate == "" || m_Paddate == null || m_Paddate == undefined) {
                $scope.Variables.notifMsg.setMessage("Production Date is required to query");
                $scope.Variables.notifMsg.notify();
                return false;
            }
        }

        $scope.Variables.svProcMK1100PK0_QryMK721Prodmins.invoke();
    };


    $scope.btnResetClick = function($event, $isolateScope) {

        $scope.Variables.svProcMK1100PK0_QryMK721Prodmins.dataSet = null;

    };

    //---------------------------------------------------------------------------------------------------------------------------
    $scope.pOrdnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = newVal.toUpperCase();
    };
    //-----------------------------------------------------------------------------------------------------------------------------

}]);


Application.$controller("gridProdEvltnController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);