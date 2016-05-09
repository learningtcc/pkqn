/**
 * Created by Michael on 2016-02-21 11:17:58.
 */
(function (window, angular, $) {
    var app = angular.module('spec.member.report', [
        'eccrm.angular',
        'eccrm.angularstrap',
        'eccrm.base.employee'
    ]);
    app.controller('Ctrl', function ($scope, CommonUtils, AlertFactory, ModalFactory, EmployeeService) {


        var years = [];
        var now = new Date().getFullYear();
        for (i = 0; i < 20; i++) {
            years.push(now - i);
        }
        years.push('不限');
        $scope.years = years;
        $scope.year = '不限';

        $scope.beans = {
            '11': [],
            '12': [],
            '13': [],
            '21': [],
            '22': [],
            '23': [],
            '3': [],
            '4': [],
            '5': [],
            '6': [],
            '7': [],
            '8': []
        };
        $scope.query = function () {
            var method = 'memberAnalysisTotal';
            if ($scope.year !== '不限') {
                method = 'memberAnalysisYear';
            }
            var promise = EmployeeService[method]({year: $scope.year}, function (data) {
                angular.forEach(data.data || [], function (o) {
                    var key = o[0] + o[1];
                    $scope.beans[key] = o;
                })
            });
            CommonUtils.loading(promise)
        };

        // 导出信息
        $scope.exportData = function () {
            window.open(CommonUtils.contextPathURL('/base/employee/export-report?year=' + ($scope.year == '不限' ? 0 : $scope.year)))
        };


        $scope.query();
    });


})(window, angular, jQuery);