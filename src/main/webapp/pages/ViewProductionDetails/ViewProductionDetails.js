Application.$controller("ViewProductionDetailsPageController", ["$scope", function($scope) {
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
        if ($scope.pageParams.pParam1 !== "" && $scope.pageParams.pParam1 !== null && $scope.pageParams.pParam1 !== undefined) {

            $scope.Variables.svProcMK1100PK0_MK570GetOrdDetails.invoke();
        }
    };

    //--------------------------------------------------------------------------------------------------------------------------------------------------
    $scope.button3Click = function($event, $isolateScope) {

        if ($scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue == "" || $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue == null || $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue == undefined) {
            $scope.Variables.notifMsg.setMessage("Order No should be entered to query");
            $scope.Variables.notifMsg.notify();
            return false;
        }

        $scope.Variables.svOR003pk0HighProfileAccess.invoke();
        $scope.Variables.svProcMK1100PK0_MK570GetOrdDetails.invoke();
    };

    //--------------------------------------------------------------------------------------------------------------------------------------------------
    $scope.btnResetClick = function($event, $isolateScope) {
        $scope.Variables.svProcMK1100PK0_MK570GetOrdDetails.dataSet = null;
        $scope.Variables.svProcMK1100PK0_MK570GetProdDetails.dataSet = null;
    };

    //------------------------------------------------------------------------------------------------------------------------------------------------------

    $scope.btnOpenGmtRoutingClick = function($event, $isolateScope) {

        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            $scope.Variables.notifMsg.setAlertType("error");
            $scope.Variables.notifMsg.setMessage("Error: Search an Order Number first");
            $scope.Variables.notifMsg.notify();
        } else {
            //here dataSet.content[0].progurl does not exist, because in the PFSDB query section, package sy9200pk0 has been set to return single record
            //window.open($scope.Variables.svGetUpchargePrgUrl.dataSet.progurl + "p_ordnum=" + $scope.Widgets.panelOr100Header.Widgets.lblOrdnum.caption);

            $scope.Variables.svGetOrdGmtRoutingProgUrl.invoke();
            // on success of svGetUpchargePrgUrl open new window

        }
    };


    $scope.svGetOrdGmtRoutingProgUrlonSuccess = function(variable, data) {

        if (data.progurl !== undefined && data.progurl !== "" && data.progurl !== null) {
            window.open(data.progurl, "_blank");
        }
    };


    $scope.pOrdnumChange = function($event, $isolateScope, newVal, oldVal) {
        $scope.Widgets.formFilter.formWidgets.pOrdnum.datavalue = newVal.toUpperCase();
    };




    //------------------------------------------------------------------------------------------------------------------------------------------------------
    // open new window - report
    $scope.svSY006pk0CallRepUrlonSuccess = function(variable, data) {


        if (data.poutUrl !== undefined && data.poutUrl !== "" && data.poutUrl !== null) {
            window.open(data.poutUrl, "_blank");
        }

    };
    //------------------------------------------------------------------------------------------------------------------------------------------------------

    $scope.btnOpenReportCu175Click = function($event, $isolateScope) {
        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            $scope.Variables.notifMsg.setAlertType("error");
            $scope.Variables.notifMsg.setMessage("Error: Search an Order Number first");
            $scope.Variables.notifMsg.notify();
        } else {

            $scope.Variables.svSY006pk0CallRepUrl.invoke({
                    "inputFields": {
                        "pReportPath": "/prod/pfs/cu/rep/cu175rp1.rdf",
                        "pParams": "&p_ordnum=" + $scope.Widgets.lblOrder.caption,
                        "pDesformat": "DELIMITED",
                        "pParamForm": "PARAMFORM"
                    }
                },
                function(data) {},
                function(error) {
                    $scope.Variables.notifMsg.setAlertType("error");
                    $scope.Variables.notifMsg.setMessage("Error: " + error);
                    $scope.Variables.notifMsg.notify();
                }
            );
        }
    };

    //------------------------------------------------------------------------------------------------------------------------------------------------------
    $scope.btnOpenReportOr815Click = function($event, $isolateScope) {
        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            $scope.Variables.notifMsg.setAlertType("error");
            $scope.Variables.notifMsg.setMessage("Error: Search an Order Number first");
            $scope.Variables.notifMsg.notify();
        } else {

            $scope.Variables.svSY006pk0CallRepUrl.invoke({
                    "inputFields": {
                        "pReportPath": "/prod/pfs/or/rep/or815rp2.rdf",
                        "pParams": "&p_ordnum=" + $scope.Widgets.lblOrder.caption,
                        "pDesformat": "PDF",
                        "pParamForm": "NOPARAM"
                    }
                },
                function(data) {},
                function(error) {
                    $scope.Variables.notifMsg.setAlertType("error");
                    $scope.Variables.notifMsg.setMessage("Error: " + error);
                    $scope.Variables.notifMsg.notify();
                }
            );
        }
    };
    //------------------------------------------------------------------------------------------------------------------------------------------------------

    $scope.btnOrderDocsClick = function($event, $isolateScope) {

        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            $scope.Variables.notifMsg.setAlertType("error");
            $scope.Variables.notifMsg.setMessage("Error: Search an Order Number first");
            $scope.Variables.notifMsg.notify();
        } else {
            if ($scope.Variables.svMK1100PK0OrderDocsUrl.dataSet.poutOrderDocsUrl !== undefined) {

                window.open($scope.Variables.svMK1100PK0OrderDocsUrl.dataSet.poutOrderDocsUrl, "_blank");
            } else {
                $scope.Variables.notifMsg.setAlertType("error");
                $scope.Variables.notifMsg.setMessage("Error: Unable to get Order Docs link");
                $scope.Variables.notifMsg.notify();
                return false;
            }
        }
    };

    //------------------------------------------------------------------------------------------------------------------------------------
    $scope.svMK1100PK0OrderDocsUrlonBeforeUpdate = function(variable, inputData) {
        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            return false;
        }

    };

    //-----------------------------------------------------------------------------------------------------------------------------------
    $scope.svProcMK1100PK0_MK570GetProdDetailsonBeforeUpdate = function(variable, inputData) {
        // do not run master-detail query when ordnum is null
        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            return false;
        }

    };
    //---------------------------------------------------------------------------------------------------------------------------------------
    $scope.svSY2110pk0GetCroquisPathonBeforeUpdate = function(variable, inputData) {
        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            return false;
        }
    };
    //---------------------------------------------------------------------------------------------------------------------------------------

    $scope.bthTechSketchClick = function($event, $isolateScope) {
        if (($scope.Widgets.lblOrder.caption == undefined) || ($scope.Widgets.lblOrder.caption == "")) {
            $scope.Variables.notifMsg.setAlertType("error");
            $scope.Variables.notifMsg.setMessage("Error: Search an Order Number first");
            $scope.Variables.notifMsg.notify();
            return false;
        } else {
            $scope.Variables.svSY2110pk0GetCroquisPath.invoke();
        }

    };



    //-------------------------------------------------------------------------------------------------------------
    // download pattern
    $scope.svSR2680PK0CheckBefDwnldPatternonSuccess = function(variable, data) {

        if (data !== undefined) {
            var patternUrl = "services/pfsdb/Srt2671/composite-id/content/patternfile?lectracode=" + data.poutLectracode + "&versionno=" + data.poutVersionno + "&pattypecode=" + data.poutPattypecode + "&gmtseq=" + data.poutGmtseq;

            var req = new XMLHttpRequest();
            req.open('GET', patternUrl);
            //console.log(req);

            req.responseType = 'arraybuffer';

            req.onload = function fileLoaded(e) {
                var blob = new Blob([this.response], {
                    type: "application/octet-stream" //"application/pdf"

                    // In case the mime type is not saved in db, we can use the content type of response. 
                    // "this.getResponseHeader('content-type');"
                });

                // Using fileSaver.js library to save the downloaded doc
                // File included in index.html
                saveAs(blob, data.poutFilename);
            };
            req.send();


        }
    };
    //----------------------------------------------------------------------------------------------------------------
    $scope.svSY2110pk0GetCroquisPathonSuccess = function(variable, data) {
        if (data !== undefined) {
            // alert any warning mesg
            if (data.poutWarningmsg !== undefined && data.poutWarningmsg !== "" &&
                data.poutWarningmsg !== null) {
                $scope.Variables.notifMsg.setAlertType("info");
                $scope.Variables.notifMsg.setMessage("Warning: " + data.poutWarningmsg);
                $scope.Variables.notifMsg.notify();
            }

            window.open(data.poutCroqpath, "_blank");
        }
    };


    $scope.svSY2110pk0GetCroquisPathonError = function(variable, data) {
        $scope.Variables.notifMsg.setAlertType("error");
        $scope.Variables.notifMsg.setMessage("Error: " + data);
        $scope.Variables.notifMsg.notify();
        return false;
    };

}]);

Application.$controller("gridProductionController", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;

        //------------------------------------------------------------------------------------------------------
        // on gridProduction, download pattern file
        $scope.btnDownloadPatternClick = function(pOrdnum, pGmtseq) {

            $scope.Variables.svSR2680PK0CheckBefDwnldPattern.invoke({
                    "inputFields": {
                        "pOrdnum": pOrdnum,
                        "pGmtseq": pGmtseq,
                        "pPrgid": $scope.Variables.statPrgid.dataSet.datavalue
                    }
                },
                function(data) {},
                function(error) {
                    $scope.Variables.notifMsg.setAlertType("error");
                    $scope.Variables.notifMsg.setMessage("Error: " + error);
                    $scope.Variables.notifMsg.notify();
                    return false;
                });

        };
        //-------------------------------------------------------------------------------------------------------
    }
]);