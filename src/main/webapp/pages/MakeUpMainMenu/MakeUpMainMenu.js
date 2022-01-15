Application.$controller("MakeUpMainMenuPageController", ["$scope", function($scope) {
    "use strict";

    /* perform any action on widgets within this block */
    $scope.onPageReady = function() {
        /*
         * widgets can be accessed through '$scope.Widgets' property here
         * e.g. to get value of text widget named 'username' use following script
         * '$scope.Widgets.username.datavalue'
         */
    };
    //--------------------------------------------------------------------------------------------------------------------------------------------------


    $scope.menu2Select = function($event, $isolateScope, $item) {


        if ($item.progurl !== undefined && $item.progurl !== null && $item.progurl !== "") {
            //  console.log($item.progurl + " ,  Path " + $item.wmitempath);

            // oracle forms always open in new window, Target = _blank
            // wavemaker pages opens in a new window first time, subsequent calls to same wmaker program will open in the already opened "new window named as WMAKER"
            if ($item.wmitempath !== undefined && $item.wmitempath !== null && $item.wmitempath !== "") {
                if ($item.wmitempath.length > 0) {
                    window.open($item.wmitempath, "WMAKER");
                }
            } else {
                window.open($item.wmitempath, "_blank");
            }
        }


    };

}]);