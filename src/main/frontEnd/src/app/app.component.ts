import {Component} from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {

  headers = ['CarName', 'Model',];
  PickUpClick: string;
  ReturnClick: string;

  rows = [{
    CarName: 1,
    Model: '',
  },
    {
      CarName: 2,
      Model: '',

    }, {
      CarName: 3,
      Model: '',
    }];

  onClick() {
    console.log(this.PickUpClick);

  }

  ThisClick() {
    console.log(this.ReturnClick);

  }
}
