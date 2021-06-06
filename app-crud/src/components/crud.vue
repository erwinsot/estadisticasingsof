<template>
  <figure class="highcharts-figure" >
    <div >
      <highcharts  class="hc" :options="chartOptions" ref="chart"></highcharts>
    </div>

    <div id="container" >
    </div>
    <p class="highcharts-description">
      Chart showing browser market shares. Clicking on individual columns
      brings up more detailed data. This chart makes use of the drilldown
      feature in Highcharts to easily switch between datasets.
    </p>

  </figure>


</template>
<script src="https://code.highcharts.com/highcharts.js"></script>
<script src="https://code.highcharts.com/modules/data.js"></script>
<script src="https://code.highcharts.com/modules/drilldown.js"></script>
<script src="https://code.highcharts.com/modules/exporting.js"></script>
<script src="https://code.highcharts.com/modules/export-data.js"></script>
<script src="https://code.highcharts.com/modules/accessibility.js"></script>
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

<!-- Latest compiled and minified JavaScript -->


<script>
import Highcharts from 'highcharts'
import axios from "axios";
export  default {
  name:"Crud",
  beforeCreate() {
    fetch("http://localhost:5050/Home/22")
        .then(resp => resp.json())
        .then(resp => {
          this.chartOptions.series[0].data = resp;
        });
  },

  data(){
    let vue2=this;
    return{
      datos:[],
      chartOptions:{
        chart:{
          type: "column"
        },
          title: {
            text: 'Browser market shares. January, 2018'
          },
          subtitle: {
            text: 'Click the columns to view versions. Source: <a href="http://statcounter.com" target="_blank">statcounter.com</a>'
          },
          accessibility: {
            announceNewData: {
              enabled: true
            }
          },
          xAxis: {
            type: 'category'
          },
          yAxis: {
            title: {
              text: 'Total percent market share'
            }

          },
          legend: {
            enabled: false
          },
          plotOptions: {
            series: {
              borderWidth: 0,
              dataLabels: {
                enabled: true,
                format: '{point.y:.1f}%'
              }
            }
          },

          tooltip: {
            headerFormat: '<span style="font-size:11px">{series.name}</span><br>',
            pointFormat: '<span style="color:{point.color}">{point.name}</span>: <b>{point.y:.2f}%</b> of total<br/>'
          },

          series: [
            {
              name: "Browsers",
              colorByPoint: true,
              data: vue2.datos
            }
          ],
          drilldown: {
            series: [
              {
                name: "Chrome",
                id: "Chrome",
                data: [
                  [
                    "v65.0",
                    0.1
                  ],
                  [
                    "v64.0",
                    1.3
                  ],
                  [
                    "v63.0",
                    53.02
                  ],
                  [
                    "v62.0",
                    1.4
                  ],
                  [
                    "v61.0",
                    0.88
                  ],
                  [
                    "v60.0",
                    0.56
                  ],
                  [
                    "v59.0",
                    0.45
                  ],
                  [
                    "v58.0",
                    0.49
                  ],
                  [
                    "v57.0",
                    0.32
                  ],
                  [
                    "v56.0",
                    0.29
                  ],
                  [
                    "v55.0",
                    0.79
                  ],
                  [
                    "v54.0",
                    0.18
                  ],
                  [
                    "v51.0",
                    0.13
                  ],
                  [
                    "v49.0",
                    2.16
                  ],
                  [
                    "v48.0",
                    0.13
                  ],
                  [
                    "v47.0",
                    0.11
                  ],
                  [
                    "v43.0",
                    0.17
                  ],
                  [
                    "v29.0",
                    0.26
                  ]
                ]
              },
              {
                name: "Firefox",
                id: "Firefox",
                data: [
                  [
                    "v58.0",
                    1.02
                  ],
                  [
                    "v57.0",
                    7.36
                  ],
                  [
                    "v56.0",
                    0.35
                  ],
                  [
                    "v55.0",
                    0.11
                  ],
                  [
                    "v54.0",
                    0.1
                  ],
                  [
                    "v52.0",
                    0.95
                  ],
                  [
                    "v51.0",
                    0.15
                  ],
                  [
                    "v50.0",
                    0.1
                  ],
                  [
                    "v48.0",
                    0.31
                  ],
                  [
                    "v47.0",
                    0.12
                  ]
                ]
              },
              {
                name: "Internet Explorer",
                id: "Internet Explorer",
                data: [
                  [
                    "v11.0",
                    6.2
                  ],
                  [
                    "v10.0",
                    0.29
                  ],
                  [
                    "v9.0",
                    0.27
                  ],
                  [
                    "v8.0",
                    0.47
                  ]
                ]
              },
              {
                name: "Safari",
                id: "Safari",
                data: [
                  [
                    "v11.0",
                    3.39
                  ],
                  [
                    "v10.1",
                    0.96
                  ],
                  [
                    "v10.0",
                    0.36
                  ],
                  [
                    "v9.1",
                    0.54
                  ],
                  [
                    "v9.0",
                    0.13
                  ],
                  [
                    "v5.1",
                    0.2
                  ]
                ]
              },
              {
                name: "Edge",
                id: "Edge",
                data: [
                  [
                    "v16",
                    2.6
                  ],
                  [
                    "v15",
                    0.92
                  ],
                  [
                    "v14",
                    0.4
                  ],
                  [
                    "v13",
                    0.1
                  ]
                ]
              },
              {
                name: "Opera",
                id: "Opera",
                data: [
                  [
                    "v50.0",
                    0.96
                  ],
                  [
                    "v49.0",
                    0.82
                  ],
                  [
                    "v12.1",
                    0.14
                  ]
                ]
              }
            ]
          }


      }

    }
  },

  created() {

  },
  mounted() {
    let vue=this;

    axios.get("http://localhost:5050/Home/22").
    then(function(response){
      vue.datos=response.data
       console.log(vue.datos)
    } )
  },


}


</script>

<style>


</style>