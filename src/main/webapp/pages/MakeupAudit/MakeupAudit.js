Application.$controller("MakeupAuditPageController", ["$scope", function($scope) {
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

        if (($scope.pageParams.pParam1 !== undefined) || ($scope.pageParams.pParam2 !== undefined)) {
            $scope.Variables.svProcMK1100PK0_GetMkupAudit.invoke();
        }
    };


    $scope.button3Click = function($event, $isolateScope) {

        var m_Ordnum = $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue;
        var m_Dyejob = $scope.Widgets.formFilter.formWidgets.pDyejob.datavalue;
        var m_From = $scope.Widgets.formFilter.formWidgets.pOpdateFrom.datavalue;
        var m_To = $scope.Widgets.formFilter.formWidgets.pOpdateTo.datavalue;


        if ((m_Ordnum == "" || m_Ordnum == null || m_Ordnum == undefined) && (m_Dyejob == "" || m_Dyejob == null || m_Dyejob == undefined)) {
            $scope.Variables.notifMsg.setMessage("Order or Dyejob should be entered");
            $scope.Variables.notifMsg.notify();
            return false;
        }

        if (m_Ordnum !== undefined) {
            if ((m_Ordnum.indexOf("%") >= 0) && (m_Ordnum.length < 6)) {
                $scope.Variables.notifMsg.setMessage("Refine your search. Order number must be greater than 6 characters long");
                $scope.Variables.notifMsg.notify();
                return false;
            }
        }

        if (m_Dyejob !== undefined) {
            if ((m_Dyejob.indexOf("%") >= 0) && (m_Dyejob.length < 6)) {
                $scope.Variables.notifMsg.setMessage("Refine your search. Dyejob must be greater than 6 characters long");
                $scope.Variables.notifMsg.notify();
                return false;
            }
        }




        if ((m_Ordnum !== "" || m_Ordnum !== null || m_Ordnum !== undefined) && (m_Dyejob !== "" || m_Dyejob !== null || m_Dyejob !== undefined)) {
            if (m_To !== "") {
                if (m_From == "" || m_From == null || m_From == undefined) {
                    $scope.Variables.notifMsg.setMessage("From opdate is required");
                    $scope.Variables.notifMsg.notify();
                    return false;
                }
            }
            if (m_From !== "") {
                if (m_To == "" || m_To == null || m_To == undefined) {
                    $scope.Variables.notifMsg.setMessage("To opdate is required");
                    $scope.Variables.notifMsg.notify();
                    return false;
                }
            }
        }

        $scope.Variables.svProcMK1100PK0_GetMkupAudit.invoke();
    };


    $scope.button1Click = function($event, $isolateScope) {
        $scope.Variables.svProcMK1100PK0_GetMkupAudit.dataSet = null;
    };

    //--------------------------------------------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_GetMkupAuditonBeforeUpdate = function(variable, inputData) {
        if (inputData.pOrdnum == undefined && inputData.pDyejob == undefined && inputData.pOpdateFrom == undefined && inputData.pOpdateTo == undefined) {
            return false;
        }


    };

    //------------------------------------------------------------------------------------------------------------------------------------------------
    $scope.pOrdnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = newVal.toUpperCase();
    };
    //------------------------------------------------------------------------------------------------------------------------------------------------ 

    $scope.pDyejobChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.pDyejob.datavalue = newVal.toUpperCase();
    };


    $scope.svProcMK1100PK0_GetMkupAuditonError = function(variable, data) {
        $scope.Variables.notifMsg.setMessage(data);
        $scope.Variables.notifMsg.notify();
        return false;
    };

}]);


Application.$controller("grid1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);