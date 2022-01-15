Application.$controller("topnavPageController", ["$scope", function($scope) {
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

    };

    //------------------------------------------------------------------------------------------
    // do not invoke sv if no parameters specified
    $scope.svAppMK1100pk0GetMenuItemsonBeforeUpdate = function(variable, inputData) {
        if ($scope.pageParams.pOrdnum == undefined || $scope.pageParams.pOrdnum == "" || $scope.pageParams.pOrdnum == null) {
            return false;
        }

    };

    //------------------------------------------------------------------------------------------
    //encode parameters
    $scope.svAppMK1100pk0GetMenuItemsonSuccess = function(variable, data) {
        //console.log(data);

        var i = 0;
        var formatted_urlobj;
        var formatted_progurl = "";
        //  debugger;

        var row = data.poutMenuItems;


        for (i = 0; i < row.length; i++) {
            if (row[i].wmparams !== undefined && row[i].wmparams !== null) {
                if (row[i].wmparams.indexOf("pParam1") > 0) {


                    formatted_urlobj = {
                        itemseq: row[i].itemseq,
                        progname: row[i].progname,
                        params: row[i].params,
                        wmparams: row[i].wmparams,
                        progurl: row[i].wmitempath + cgen.PageParamEncode(row[i].wmparams),
                        wmitempath: row[i].wmitempath
                    };

                } else {
                    formatted_urlobj = row[i];
                }
            } else {
                formatted_urlobj = row[i];
            }

            $scope.Variables.statFormattedProgUrl.dataSet.push(formatted_urlobj);
        }

    };
    //--------------------------------------------------------------------------------------------------------------------------------------------------

    $scope.menuProgramsSelect = function($event, $isolateScope, $item) {
        // console.log($item);

        if ($item.progurl !== undefined && $item.progurl !== null && $item.progurl !== "") {
            //  console.log($item.progurl + " ,  Path " + $item.wmitempath);

            // oracle forms always open in new window, Target = _blank
            // wavemaker pages opens in a new window first time, subsequent calls to same wmaker program will open in the already opened "new window named as WMAKER"
            if ($item.wmitempath !== undefined && $item.wmitempath !== null && $item.wmitempath !== "") {
                if ($item.wmitempath.length > 0) {
                    window.open($item.progurl, "WMAKER");
                }
            } else {
                window.open($item.progurl, "_blank");
            }
        }


    };

}]);