<template>
  <div v-if="chartOptions.series[0].data.length">
    <highcharts class="hc" :options="chartOptions" ref="chart"></highcharts>
  </div>
</template>

<script>
export default {
  beforeCreate() {
    fetch("http://localhost:5050/Home/22")
        .then(resp => resp.json())
        .then(resp => {
          this.chartOptions.series[0].data = resp;
        });
  },

  data() {
    return {
      chartOptions: {
        series: [
          {
            data: []
          }
        ]
      }
    };
  }
};
</script>

<style>
.hc {
  height: 600px;
}
</style>
