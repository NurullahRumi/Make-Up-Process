Application.$controller("partialJobLoadUnloadQtyPageController", ["$scope", function($scope) {
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


    $scope.svProcMK1100PK0_MK440GetjobLoadunldqtyonBeforeUpdate = function(variable, inputData) {
        if (inputData.pOrdnum == undefined || inputData.pGmtseq == undefined || inputData.pClrseqg == undefined || inputData.pSzeseq == undefined) {
            return false;
        }
    };

}]);


Application.$controller("grid1Controller", ["$scope",
    function($scope) {
        "use strict";
        $scope.ctrlScope = $scope;
    }
]);