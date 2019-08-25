(function() {
    'use strict';

    angular
        .module('greenFurniture')
        .controller('JobPostingController', JobPostingController);

    JobPostingController.$inject = ['ParseLinks', 'AlertService', '$state', 'JobPosting'];

    function JobPostingController(ParseLinks, AlertService, $state, JobPosting ) {
        var vm = this;

        vm.authorities = ['ROLE_USER', 'ROLE_ADMIN'];
        vm.loadAll = loadAll;
        vm.jobpostings = [];
        vm.clear = clear;
        vm.links = null;

        vm.loadAll();
        
        function loadAll () {
			JobPosting.query({},onSuccess, onError);
        }

        function onSuccess(data, headers) {
        	vm.jobpostings = data;
        }

        function onError(error) {
            AlertService.error(error.data.message);
        }

        function clear () {
        	vm.posting = {
        			id : null,
					description : null,
					location : null,
					title : null,
					requirements : null
            };
        }
    }
})();
